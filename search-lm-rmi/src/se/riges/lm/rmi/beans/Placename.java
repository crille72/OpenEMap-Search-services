/*
Copyright Härnösands kommun(C) 2014 

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    All rights reserved. This program and the accompanying materials
    are made available under the terms of the GNU Affero General Public License
    which accompanies this distribution, and is available at
    http://www.gnu.org/licenses/agpl-3.0.html
 */
package se.riges.lm.rmi.beans;

import java.io.Serializable;

import se.riges.lm.rmi.interfaces.IPlacename;

public class Placename implements IPlacename, Serializable {

	static final long serialVersionUID = -1861605790751137787L;

	private String name;
	private String municipality;
	private String geometry;
	
	public Placename(){}
	
	public Placename(String name, String municipality, String geometry){
		this.name = name;
		this.municipality = municipality;
		this.geometry = geometry;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getMunicipality() {
		// TODO Auto-generated method stub
		return this.municipality;
	}

	@Override
	public String getGeometry() {
		return this.geometry;
	}

}
