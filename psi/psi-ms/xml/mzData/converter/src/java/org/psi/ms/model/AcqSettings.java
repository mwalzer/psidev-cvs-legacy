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

import java.io.Serializable;
import java.util.Hashtable;

/**
 * Settings for this specific acquisition.
 *
 * @version $Revision$ $Date$
 */
public class AcqSettings implements java.io.Serializable {
    /**
     * Type of spectrum
     */
    private SpecType _specType;
    /**
     * Specification for combining raw scans/acquisitions into a
     * single peak list. Either a list of acquisitions, or a range
     * of acquisitions can be specified.
     */
    private AcqSpecification _acqSpecification;
    /**
     * Field _instrument
     */
    private InstrumentAcqSettings _instrument;
    /**
     * Field _acqTime
     */
    private AcqTime _acqTime;


    //----------------/
    //- Constructors -/
    //----------------/

    public AcqSettings() {
        super();
    } //-- org.psi.ms.model.AcqSettings()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'acqSpecification'. The field
     * 'acqSpecification' has the following description:
     * Specification for combining raw scans/acquisitions into a
     * single peak list. Either a list of acquisitions, or a range
     * of acquisitions can be specified.
     *
     * @return the value of field 'acqSpecification'.
     */
    public AcqSpecification getAcqSpecification() {
        if (_acqSpecification == null)
            _acqSpecification = new AcqSpecification();
        return this._acqSpecification;
    } //-- org.psi.ms.model.AcqSpecification getAcqSpecification()

    /**
     * Returns the value of field 'acqTime'.
     *
     * @return the value of field 'acqTime'.
     */
    public AcqTime getAcqTime() {
        return this._acqTime;
    } //-- org.psi.ms.model.AcqTime getAcqTime()

    /**
     * Returns the value of field 'instrument'.
     *
     * @return the value of field 'instrument'.
     */
    public InstrumentAcqSettings getInstrument() {
        if (_instrument == null)
            _instrument = new InstrumentAcqSettings();
        return this._instrument;
    } //-- org.psi.ms.model.InstrumentAcqSettings getInstrument2()

    /**
     * Returns the value of field 'specType'. The field 'specType'
     * has the following description: Type of spectrum
     *
     * @return the value of field 'specType'.
     */
    public SpecType getSpecType() {
        return this._specType;
    } //-- org.psi.ms.model.types.SpecType getSpecType()

    /**
     * Sets the value of field 'acqSpecification'. The field
     * 'acqSpecification' has the following description:
     * Specification for combining raw scans/acquisitions into a
     * single peak list. Either a list of acquisitions, or a range
     * of acquisitions can be specified.
     *
     * @param acqSpecification the value of field 'acqSpecification'
     */
    public void setAcqSpecification(AcqSpecification acqSpecification) {
        this._acqSpecification = acqSpecification;
    } //-- void setAcqSpecification(org.psi.ms.model.AcqSpecification)

    /**
     * Sets the value of field 'acqTime'.
     *
     * @param acqTime the value of field 'acqTime'.
     */
    public void setAcqTime(AcqTime acqTime) {
        this._acqTime = acqTime;
    } //-- void setAcqTime(org.psi.ms.model.AcqTime)

    /**
     * Sets the value of field 'instrument'.
     *
     * @param instrument the value of field 'instrument'.
     */
    public void setInstrument(InstrumentAcqSettings instrument) {
        this._instrument = instrument;
    } //-- void setInstrument(org.psi.ms.model.InstrumentAcqSettings)

    /**
     * Sets the value of field 'specType'. The field 'specType' has
     * the following description: Type of spectrum
     *
     * @param specType the value of field 'specType'.
     */
    public void setSpecType(SpecType specType) {
        this._specType = specType;
    } //-- void setSpecType(org.psi.ms.model.types.SpecType)

    /**
     * Class SpecType.
     *
     */
    public static class SpecType implements Serializable {


        //--------------------------/
        //- Class/Member Variables -/
        //--------------------------/

        /**
         * The discrete type
         */
        public static final int DISCRETE_TYPE = 0;

        /**
         * The instance of the discrete type
         */
        public static final SpecType DISCRETE = new SpecType(DISCRETE_TYPE, "discrete");

        /**
         * The continuous type
         */
        public static final int CONTINUOUS_TYPE = 1;

        /**
         * The instance of the continuous type
         */
        public static final SpecType CONTINUOUS = new SpecType(CONTINUOUS_TYPE, "continuous");

        /**
         * Field _memberTable
         */
        private static java.util.Hashtable _memberTable = init();

        /**
         * Field type
         */
        private int type = -1;

        /**
         * Field stringValue
         */
        private String stringValue = null;


        //----------------/
        //- Constructors -/
        //----------------/

        private SpecType(int type, String value) {
            super();
            this.type = type;
            this.stringValue = value;
        } //-- org.psi.ms.model.types.SpecType(int, java.lang.String)


        //-----------/
        //- Methods -/
        //-----------/

        /**
         * Method enumerateReturns an enumeration of all possible
         * instances of SpecType
         */
        public static java.util.Enumeration enumerate() {
            return _memberTable.elements();
        } //-- java.util.Enumeration enumerate()

        /**
         * Method getTypeReturns the type of this
         * SpecType
         */
        public int getType() {
            return this.type;
        } //-- int getType()

        /**
         * Method init
         */
        private static java.util.Hashtable init() {
            Hashtable members = new Hashtable();
            members.put("discrete", DISCRETE);
            members.put("continuous", CONTINUOUS);
            return members;
        } //-- java.util.Hashtable init()

        /**
         * Method toStringReturns the String representation of this
         * SpecType
         */
        public String toString() {
            return this.stringValue;
        } //-- java.lang.String toString()

        /**
         * Method valueOfReturns a new SpecType
         * based on the given String value.
         *
         * @param string
         */
        public static SpecType valueOf(String string) {
            Object obj = null;
            if (string != null) obj = _memberTable.get(string);
            if (obj == null) {
                String err = "'" + string + "' is not a valid SpecType";
                throw new IllegalArgumentException(err);
            }
            return (SpecType) obj;
        } //-- org.psi.ms.model.types.SpecType valueOf(java.lang.String)
    }

}
