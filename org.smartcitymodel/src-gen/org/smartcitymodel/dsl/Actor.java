/**
 * generated by Xtext 2.36.0
 */
package org.smartcitymodel.dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smartcitymodel.dsl.Actor#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.smartcitymodel.dsl.Actor#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.smartcitymodel.dsl.Actor#getActions <em>Actions</em>}</li>
 *   <li>{@link org.smartcitymodel.dsl.Actor#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.smartcitymodel.dsl.DslPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Entity
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.smartcitymodel.dsl.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.smartcitymodel.dsl.DslPackage#getActor_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link org.smartcitymodel.dsl.Port}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see org.smartcitymodel.dsl.DslPackage#getActor_Ports()
   * @model containment="true"
   * @generated
   */
  EList<Port> getPorts();

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.smartcitymodel.dsl.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see org.smartcitymodel.dsl.DslPackage#getActor_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference.
   * @see #setLocation(Location)
   * @see org.smartcitymodel.dsl.DslPackage#getActor_Location()
   * @model containment="true"
   * @generated
   */
  Location getLocation();

  /**
   * Sets the value of the '{@link org.smartcitymodel.dsl.Actor#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(Location value);

} // Actor
