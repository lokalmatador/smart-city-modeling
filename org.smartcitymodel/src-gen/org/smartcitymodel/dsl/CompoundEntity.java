/**
 * generated by Xtext 2.36.0
 */
package org.smartcitymodel.dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smartcitymodel.dsl.CompoundEntity#getSensors <em>Sensors</em>}</li>
 *   <li>{@link org.smartcitymodel.dsl.CompoundEntity#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see org.smartcitymodel.dsl.DslPackage#getCompoundEntity()
 * @model
 * @generated
 */
public interface CompoundEntity extends Entity
{
  /**
   * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
   * The list contents are of type {@link org.smartcitymodel.dsl.Sensor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensors</em>' containment reference list.
   * @see org.smartcitymodel.dsl.DslPackage#getCompoundEntity_Sensors()
   * @model containment="true"
   * @generated
   */
  EList<Sensor> getSensors();

  /**
   * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
   * The list contents are of type {@link org.smartcitymodel.dsl.Actor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actors</em>' containment reference list.
   * @see org.smartcitymodel.dsl.DslPackage#getCompoundEntity_Actors()
   * @model containment="true"
   * @generated
   */
  EList<Actor> getActors();

} // CompoundEntity
