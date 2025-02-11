from contextlib import contextmanager
import sys

def generateNodes(amount: int) -> list[str]:
    """
    Generates the standard set of sensors for the scenario. The amount specifies how often this set is multiplied.
    """
    generated = []

    for k in range(amount):
        # WQ Node
        nodeName = f"WQ_{k}"
        generated.append(f"node {nodeName}" + "{\n")
        tempSensor = f"sensor temperature_{nodeName}_{k}" + "{\n type TEMPERATURE\npriority 1\n}"
        phSensor = f"sensor ph_{nodeName}_{k}" + "{\n type PH\npriority 1\n}"
        turbiditySensor = f"sensor turbidity_{nodeName}_{k}" + "{\n type TURBIDITY\npriority 1\n}"
        tdsSensor = f"sensor tds_{nodeName}_{k}" + "{\n type TDS\npriority 1\n}"
        generated.append(tempSensor)
        generated.append(phSensor)
        generated.append(turbiditySensor)
        generated.append(tdsSensor)

        controller = f"controller esp32_{nodeName}_{k}" + "{\n type ESP32\npriority 3\n}"
        generated.append(controller)

        link1 = f"link SPI from temperature_{nodeName}_{k} -> esp32_{nodeName}_{k}" + "{\n delay [1..12]\ndatatype TEMPERATURE\n}"
        generated.append(link1)
        link2 = f"link ADC from ph_{nodeName}_{k} -> esp32_{nodeName}_{k}" + "{\n delay [1..12]\ndatatype PH\n}"
        generated.append(link2)
        link3 = f"link ADC from turbidity_{nodeName}_{k} -> esp32_{nodeName}_{k}" + "{\n delay [1..12]\ndatatype TURBIDITY\n}"
        generated.append(link3)
        link4 = f"link ADC from tds_{nodeName}_{k} -> esp32_{nodeName}_{k}" + "{\n delay [1..12]\ndatatype TDS\n}"
        generated.append(link4)

        generated.append("postFrequency 3600 SECONDS")
        generated.append("priority 3")

        # Close the WQ Node
        generated.append("}")


        # WL Node
        nodeName = f"WL_{k}"
        generated.append(f"node {nodeName}" + "{")
        tempSensor = f"sensor temperature_{nodeName}_{k}" + "{\n type TEMPERATURE\npriority 1\n}"
        ultrasonicSensor = f"sensor ultrasonic_{nodeName}_{k}" + "{\n type ULTRASONIC\npriority 1\n}"
        generated.append(tempSensor)
        generated.append(ultrasonicSensor)

        controller = f"controller esp32_{nodeName}_{k}" + "{\n type ESP32\npriority 3\n}"
        generated.append(controller)

        link1 = f"link SPI from temperature_{nodeName}_{k} -> esp32_{nodeName}_{k}" + "{\n delay [1..12]\ndatatype TEMPERATURE\n}"
        generated.append(link1)
        link2 = f"link UART from ultrasonic_{nodeName}_{k} -> esp32_{nodeName}_{k}" + "{\n delay [1..12]\ndatatype ULTRASONIC\n}"
        generated.append(link2)

        generated.append("postFrequency 1 SECONDS")
        generated.append("priority 3")

        # Close the WL Node
        generated.append("}")

        # WQ_CAM Node
        nodeName = f"WQCAM_{k}"
        generated.append(f"node {nodeName}" + "{")
        cameraSensor = f"sensor camera_{nodeName}_{k}" + "{\n type CAMERA\npriority 1\n}"
        generated.append(cameraSensor)

        controller = f"controller raspi_{nodeName}_{k}" + "{\n type RASPBERRY_PI\npriority 3\n}"
        generated.append(controller)

        link1 = f"link SPI from camera_{nodeName}_{k} -> raspi_{nodeName}_{k}" + "{\n delay [1..12]\ndatatype CAMERA\n}"
        generated.append(link1)

        generated.append("postFrequency 300 SECONDS")
        generated.append("priority 3")

        # Close the Node
        generated.append("}")

        # WQ_PULSE Node
        nodeName = f"WQPULSE_{k}"
        generated.append(f"node {nodeName}" + "{")
        pulseSensor = f"sensor pulse_{nodeName}_{k}" + "{\n type PULSE\npriority 1\n}"
        generated.append(pulseSensor)

        controller = f"controller esp32_{nodeName}_{k}" + "{\n type ESP32\npriority 3\n}"
        generated.append(controller)

        link1 = f"link SPI from pulse_{nodeName}_{k} -> esp32_{nodeName}_{k}" + "{\n delay [1..12]\ndatatype PULSE\n}"
        generated.append(link1)

        generated.append("postFrequency 300 SECONDS")
        generated.append("priority 3")

        # Close the Node
        generated.append("}")

        # MC Node
        nodeName = f"MC_{k}"
        generated.append(f"node {nodeName}" + "{")
        currentSensor = f"sensor current_{nodeName}_{k}" + "{\n type CURRENT\npriority 1\n}"
        generated.append(currentSensor)

        controller = f"controller esp32_{nodeName}_{k}" + "{\n type ESP32\npriority 3\n}"
        generated.append(controller)

        link1 = f"link SPI from current_{nodeName}_{k} -> esp32_{nodeName}_{k}" + "{\n delay [1..12]\ndatatype PULSE\n}"
        generated.append(link1)

        generated.append("postFrequency 1 SECONDS")
        generated.append("priority 3")

        # Close the Node
        generated.append("}")

    return generated


def buildContent(level: int) -> list[str]:
    content = generateNodes(level)

    content.append("\n")
    content.append("dataGateway oneM2M {\npriority 4\ndelay [1..3]\n}")

    return content

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print(f"Usage: {sys.argv[0]} <factor>")

    level = int(sys.argv[1])
    with open(f"./gen_level{level}.smartcity", 'w') as file:
        file.writelines(buildContent(level))
