/*
 *  This file is part of the Multimodal Mobility Analyser(MMA), based
 *  on the Smartphone Sensing Framework (SSF)

    MMA (also SSF) is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    MMA (also SSF) is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with MMA.  If not, see <http://www.gnu.org/licenses/>.
 */

package edu.example.embSys.mma.charts.converter;

import java.util.List;
// TODO: Auto-generated Javadoc

/**
 * This class contains helper methods for conversion purposes .
 *
 * @author Dionysios Satikidis (dionysios.satikidis@gmail.com)
 * @version 1.0
 */
public class ChartDataConverter {
	
	/**
	 * Converter converts from List<Double> to double[].
	 *
	 * @param list the list
	 * @return the double[]
	 */
	public static double[] listToArrayDouble(List<Double> list) {
		double[] dout = new double[list.size()];
		
		for (int i = 0; i < list.size(); i++) {
			dout[i]=list.get(i);
		}
		return dout;
	}

}
