/* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
package org.semanticweb.owlapi.model;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health Informatics Group
 * @since 2.0.0
 */
public interface OWLObjectPropertyExpression extends OWLPropertyExpression, SWRLPredicate {

    /**
     * Obtains the property that corresponds to the inverse of this property.
     *
     * @return The inverse of this property. Note that this property will not necessarily be in the
     *         simplest form.
     */
    OWLObjectPropertyExpression getInverseProperty();

    /**
     * Returns this property in its simplified form.
     *
     * @return Let p be a property name and PE an object property expression. The simplification,
     *         'simp', is defined as follows:<br>
     *         {@code simp(p) = p}<br>
     *         {@code simp(inv(p)) = inv(p)}<br>
     * @deprecated Since it is not legal to apply ObjectInverseOf to anything other than an Object
     *             Property, all object properties are always in the simpled form.
     */
    @Deprecated
    default OWLObjectPropertyExpression getSimplified() {
        return this;
    }

    /**
     * Get the named object property used in this property expression.
     *
     * @return P if this expression is either inv(P) or P.
     */
    OWLObjectProperty getNamedProperty();

    @Override
    default boolean isObjectPropertyExpression() {
        return true;
    }
}
