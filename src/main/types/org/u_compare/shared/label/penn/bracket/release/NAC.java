

/* First created by JCasGen Wed Mar 16 10:14:05 CET 2011 */
package org.u_compare.shared.label.penn.bracket.release;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.u_compare.shared.label.penn.bracket.Phrase;


/** Not a constituent
 * Updated by JCasGen Tue Mar 06 16:28:15 CET 2012
 * XML source: /vol/home-vol3/wbi/wbi_stud/VLKB/Tim/vlkb/chemspotVSoscar3/desc/cr/iobCR.xml
 * @generated */
public class NAC extends Phrase {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(NAC.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NAC() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NAC(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NAC(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
}

    