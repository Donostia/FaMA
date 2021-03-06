/*
	This file is part of FaMaTS.

    FaMaTS is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    FaMaTS is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with FaMaTS.  If not, see <http://www.gnu.org/licenses/>.

 */
/*
 * Created on 15-Mar-2005
 */
package es.us.isa.FAMA.models.FAMAfeatureModel;

import es.us.isa.FAMA.models.featureModel.GenericRelation;

/**
 * @author   trinidad, Manuel Nieto Ucl�s
 */
public abstract class Dependency extends GenericRelation {	
	protected Feature origin;
	protected Feature destination;
	
	protected Dependency(String name){
		this.name = name;
	}
	
	protected Dependency(Feature origin, Feature destination){
		this.origin = origin;
		this.destination = destination;
	}
	
	protected Dependency(String name, Feature origin, Feature destination){
		this.name = name;
		this.origin = origin;
		this.destination = destination;
	}
	
	/**
	 * @return
	 * @uml.property  name="origin"
	 */
	public Feature getOrigin(){
		return origin;
	}
	
	/**
	 * @param f
	 * @uml.property  name="origin"
	 */
	public void setOrigin(Feature f){
		if ( f != null) {
			origin = f;
		}
	}
	
	/**
	 * @return
	 * @uml.property  name="destination"
	 */
	public Feature getDestination(){
		return destination;
	}
	
	/**
	 * @param f
	 * @uml.property  name="destination"
	 */
	public void setDestination(Feature f){
		if ( f != null) {
			destination = f;
		}
	}
}
