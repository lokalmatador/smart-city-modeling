/**
 * generated by Xtext 2.36.0
 */
package org.smartcitymodel.dsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TIME</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smartcitymodel.dsl.DslPackage#getTIME()
 * @model
 * @generated
 */
public enum TIME implements Enumerator
{
  /**
   * The '<em><b>S</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #S_VALUE
   * @generated
   * @ordered
   */
  S(0, "s", "s"),

  /**
   * The '<em><b>M</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #M_VALUE
   * @generated
   * @ordered
   */
  M(1, "m", "m"),

  /**
   * The '<em><b>H</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #H_VALUE
   * @generated
   * @ordered
   */
  H(2, "h", "h"),

  /**
   * The '<em><b>D</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #D_VALUE
   * @generated
   * @ordered
   */
  D(3, "d", "d");

  /**
   * The '<em><b>S</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #S
   * @model name="s"
   * @generated
   * @ordered
   */
  public static final int S_VALUE = 0;

  /**
   * The '<em><b>M</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #M
   * @model name="m"
   * @generated
   * @ordered
   */
  public static final int M_VALUE = 1;

  /**
   * The '<em><b>H</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #H
   * @model name="h"
   * @generated
   * @ordered
   */
  public static final int H_VALUE = 2;

  /**
   * The '<em><b>D</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #D
   * @model name="d"
   * @generated
   * @ordered
   */
  public static final int D_VALUE = 3;

  /**
   * An array of all the '<em><b>TIME</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TIME[] VALUES_ARRAY =
    new TIME[]
    {
      S,
      M,
      H,
      D,
    };

  /**
   * A public read-only list of all the '<em><b>TIME</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TIME> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>TIME</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TIME get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TIME result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>TIME</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TIME getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TIME result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>TIME</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TIME get(int value)
  {
    switch (value)
    {
      case S_VALUE: return S;
      case M_VALUE: return M;
      case H_VALUE: return H;
      case D_VALUE: return D;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private TIME(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //TIME
