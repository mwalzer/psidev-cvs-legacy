/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * This is an individual supplemental data item. These may or may
 * not be keyed to an acqusition.
 *
 * @version $Revision$ $Date$
 */
public class Supplement implements java.io.Serializable {
    /**
     * Field _id
     */
    private int _id;
    /**
     * keeps track of state for field: _id
     */
    private boolean _has_id;
    /**
     * If the raw data representation method was not binary or if
     * the supplemental data array was a string- or other
     * non-binary type, then it can be represented in the dataArray
     * element.
     */
    private DataArray _dataArray;
    /**
     * In addition to the m/z and intensity arrays, an arbitrary
     * number of other arrays can be stored using the same
     * indexing. For each array stored as base64 binary a precision
     * must be specified. The only type allowed is IEEE-754
     * floating point.
     */
    private DataArrayBinary _dataArrayBinary;


    //----------------/
    //- Constructors -/
    //----------------/

    public Supplement() {
        super();
    } //-- org.psi.ms.model.Supplement()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method isValid
     */
    public boolean isValid() {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid()

    /**
     * Method marshal
     *
     * @param out
     */
    public void marshal(java.io.Writer out)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {

        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer)

    /**
     * Method marshal
     *
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
            throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {

        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler)

    /**
     * Method unmarshal
     *
     * @param reader
     */
    public static org.psi.ms.model.Supplement unmarshal(java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.psi.ms.model.Supplement) Unmarshaller.unmarshal(org.psi.ms.model.Supplement.class, reader);
    } //-- org.psi.ms.model.Supplement unmarshal(java.io.Reader)

    /**
     * Method validate
     */
    public void validate()
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate()

    /**
     * Returns the value of field 'dataArray'. The field
     * 'dataArray' has the following description: If the raw data
     * representation method was not binary or if the supplemental
     * data array was a string- or other non-binary type, then it
     * can be represented in the dataArray element.
     *
     * @return the value of field 'dataArray'.
     */
    public DataArray getDataArray() {
        return this._dataArray;
    } //-- org.psi.ms.model.DataArray getDataArray()

    /**
     * Returns the value of field 'dataArrayBinary'. The field
     * 'dataArrayBinary' has the following description: In addition
     * to the m/z and intensity arrays, an arbitrary number of
     * other arrays can be stored using the same indexing. For each
     * array stored as base64 binary a precision must be specified.
     * The only type allowed is IEEE-754 floating point.
     *
     * @return the value of field 'dataArrayBinary'.
     */
    public DataArrayBinary getDataArrayBinary() {
        return this._dataArrayBinary;
    } //-- org.psi.ms.model.DataArrayBinary getDataArrayBinary()

    /**
     * Returns the value of field 'id'.
     *
     * @return the value of field 'id'.
     */
    public int getId() {
        return this._id;
    } //-- int getId()

    /**
     * Method hasId
     */
    public boolean hasId() {
        return this._has_id;
    } //-- boolean hasId()

    /**
     * Sets the value of field 'dataArray'. The field 'dataArray'
     * has the following description: If the raw data
     * representation method was not binary or if the supplemental
     * data array was a string- or other non-binary type, then it
     * can be represented in the dataArray element.
     *
     * @param dataArray the value of field 'dataArray'.
     */
    public void setDataArray(DataArray dataArray) {
        this._dataArray = dataArray;
    } //-- void setDataArray(org.psi.ms.model.DataArray)

    /**
     * Sets the value of field 'dataArrayBinary'. The field
     * 'dataArrayBinary' has the following description: In addition
     * to the m/z and intensity arrays, an arbitrary number of
     * other arrays can be stored using the same indexing. For each
     * array stored as base64 binary a precision must be specified.
     * The only type allowed is IEEE-754 floating point.
     *
     * @param dataArrayBinary the value of field 'dataArrayBinary'.
     */
    public void setDataArrayBinary(DataArrayBinary dataArrayBinary) {
        this._dataArrayBinary = dataArrayBinary;
    } //-- void setDataArrayBinary(org.psi.ms.model.DataArrayBinary)

    /**
     * Sets the value of field 'id'.
     *
     * @param id the value of field 'id'.
     */
    public void setId(int id) {
        this._id = id;
        this._has_id = true;
    } //-- void setId(int)

}
