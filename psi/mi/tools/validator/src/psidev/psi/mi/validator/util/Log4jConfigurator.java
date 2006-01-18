/*
 * Copyright (c) 2002 The European Bioinformatics Institute, and others.
 * All rights reserved. Please see the file LICENSE
 * in the root directory of this distribution.
 */
package psidev.psi.mi.validator.util;

import org.apache.log4j.PropertyConfigurator;

/**
 * TODO comment this
 *
 * @author Samuel Kerrien (skerrien@ebi.ac.uk)
 * @version $Id$
 * @since <pre>18-Jan-2006</pre>
 */
public class Log4jConfigurator {
    public static void configure() {
       // BasicConfigurator replaced with PropertyConfigurator.
        PropertyConfigurator.configure( "config/log4j.properties" );
    }
}