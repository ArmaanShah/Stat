/*
 * Stat.java
 * Author:  Armaan Shah
 * Submission Date: November 15th 2024
 *
 *This program does the following:
 *The following code defines a Stat class that stores an array of double values 
 *and gives methods to analyze the data in different ways. These calculations include
 *finding the min, max, average, mode, variance and standard deviation amongst other things. 
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from any source other than the course webpage 
 * or the course textbook. I recognize that any unauthorized 
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the 
 * policies of this course. I recognize that my work is based 
 * on an assignment created by the School of Computing 
 * at the University of Georgia. Any publishing or
 * posting of source code for this assignment is strictly 
 * prohibited unless you have written consent from the 
 * School of Computing at the University of Georgia.  
 */
public class Stat {

	private double[] data;// Array to hold data values

	public Stat() { // Default constructor
		data = new double[0];// initialize with an empty array
	}

	public Stat(double[] d) {
		if (d == null) {
			data = new double[0];
		} else {
			this.data = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				this.data[i] = d[i];
			}
		}
	}

	public Stat(float[] f) {
		if (f == null) {
			data = new double[0];
		} else {
			data = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				this.data[i] = f[i];
			}
		}
	}

	public Stat(int[] i) {
		if (i == null) {
			data = new double[0];
		} else {
			data = new double[i.length];
			;
			for (int j = 0; j < i.length; j++) {
				this.data[j] = i[j];
			}
		}
	}

	public Stat(long[] lo) {
		if (lo == null) {
			data = new double[0];
		} else {
			data = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				this.data[i] = lo[i];
			}
		}
	}

	// Sets the values of data to a copy of array d.
	public void setData(double[] d) {
		if (d == null) {
			this.data = new double[0]; // Set to an empty array if input is null
			return;
		} else {
			this.data = new double[d.length];

			for (int i = 0; i < d.length; i++) {
				this.data[i] = d[i];
			}
		}

	}
	// Sets data to a copy of a provided float array, or an empty array if null

	public void setData(float[] f) {
		if (f != null) {
			this.data = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				this.data[i] = f[i];
			}
		} else {
			data = new double[0];
		}
	}
	// Sets data to a copy of a provided int array, or an empty array if null

	public void setData(int[] i) {
		if (i != null) {
			this.data = new double[i.length];
			for (int j = 0; j < i.length; j++) {
				this.data[j] = i[j];
			}
		} else {
			this.data = new double[0];
		}

	}
	// Sets data to a copy of a provided long array, or an empty array if null

	public void setData(long[] lo) {
		if (lo != null) {
			this.data = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				this.data[i] = lo[i];
			}
		} else {
			this.data = new double[0];
		}
	}

	public double[] getData() {

		double[] copy = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			copy[i] = data[i];
		}
		return copy; // Returns a copy of the data array
	}

	// Checks if the calling Stat object and Stat s have identical data arrays.

	public boolean equals(Stat s) {
		if (s == null) {
			return false; // Return false if s is null
		}
		if (this.data.length != s.getData().length) {
			if (data.length != s.data.length) {
				return false;
			}
			for (int i = 0; i < data.length; i++) {
				if (data[i] != s.data[i]) {
					return false;
				}
			}

		}
		return true; // returns true if the stat object and stat object s have the same order and
						// values
	}

	public void reset() {
		this.data = new double[0];
	}
	// Appends values from an int array to the existing data array

	public void append(int[] i) {
		if (i != null) {
			double[] newData = new double[data.length + i.length];
			for (int j = 0; j < data.length; j++) {
				newData[j] = this.data[j];
			}
			for (int j = 0; j < i.length; j++) {
				newData[data.length + j] = i[j];
			}
			this.data = newData;
		}
	}
	// Appends values from a float array to the existing data array

	public void append(float[] f) {
		if (f != null) {
			double[] newData = new double[f.length + data.length];
			for (int i = 0; i < data.length; i++) {
				newData[i] = this.data[i];
			}
			for (int i = 0; i < f.length; i++) {
				newData[data.length + i] = f[i];
			}
			this.data = newData;
		}
	}
	// Appends values from a long array to the existing data array

	public void append(long[] lo) {
		if (lo != null) {
			double[] newData = new double[data.length + lo.length];
			for (int i = 0; i < data.length; i++) {
				newData[i] = this.data[i];
			}
			for (int i = 0; i < lo.length; i++) {
				newData[data.length + i] = lo[i];
			}
			this.data = newData;
		}
	}
	// Appends values from a double array to the existing data array

	public void append(double[] d) {
		if (d != null) {
			double[] newData = new double[data.length + d.length];
			for (int i = 0; i < data.length; i++) {
				newData[i] = this.data[i];
			}
			for (int i = 0; i < d.length; i++) {
				newData[data.length + i] = d[i];
			}
			this.data = newData;
		}
	}

	public boolean isEmpty() { // returns true if the object is empty and false if it isnt
		if (data.length == 0) {
			return true;
		} else
			return false;
	}

	// Returns a String representation of the data array
	public String toString() {// takes the data array and coverts it to a string
		String result = "[";
		for (int i = 0; i < data.length; i++) {
			result += data[i];
			if (i < data.length - 1) {
				result += ", ";
			}
		}
		result += "]";
		return result;
	}
	// Calculates the minimum value in data.

	public double min() {
		if (data.length == 0) {
			return Double.NaN; // Return NaN if data is empty
		}
		double min = data[0];
		for (double value : data) {
			if (value < min) {
				min = value;
			}
		}
		return min;
	}
	// Calculates the maximum value in data.

	public double max() {
		if (data.length == 0) {
			return Double.NaN; // Return NaN if data is empty
		}
		double max = data[0];
		for (double value : data) {
			if (value > max) {
				max = value;
			}
		}
		return max;
	}
	// Calculates the average (mean) value based on the values in the data set.

	public double average() {
		if (data.length == 0) {
			return Double.NaN; // Return NaN if data is empty
		}
		double sum = 0;
		double length = data.length;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum / length;// returns the average value
	}
	// Calculates the mode (most frequent value) of data.

	public double mode() {

		double mode = Double.NaN;
		int maxCount = 0;

		if (data.length == 0) {
			return Double.NaN; // Return NaN if data is empty
		}
		for (int i = 0; i < data.length; i++) {
			int count = 1;
			for (int j = i + 1; j < data.length; j++) {
				if (data[j] == data[i]) {
					count++;
				}
			}
			if (count > maxCount) {
				mode = data[i];
				maxCount = count;
			} else if (count == maxCount) {
				mode = Double.NaN;
			}
		}

		return mode;
	}
	// Returns the variance of the data, or NaN if the array is empty

	public double variance() {
		if (data.length == 0) {
			return Double.NaN;
		} else {

			double mean = average();
			double sumOfSquares = 0.0;

			for (int i = 0; i < data.length; i++) {
				double diff = data[i] - mean;
				sumOfSquares += diff * diff;
			}

			return sumOfSquares / data.length;
		}
	}
	// Returns the standard deviation of the data, or NaN if the array is empty

	public double standardDeviation() {
		if (data.length == 0) {
			return Double.NaN;
		} else {
			double variance = variance();
			return Math.sqrt(variance);
		}
	}

	public static void main(String[] args) {
		double[] data1 = {};
		double[] data2 = { 25 };
		float[] data3 = {};
		float[] data4 = { 25 };
		int[] data5 = {};
		int[] data6 = { 50 };
		long[] data7 = {};
		long[] data8 = { 12 };
		Stat stat1 = new Stat();
		stat1.append(data1);
		stat1.append(data2);
		stat1.append(data3);
		stat1.append(data4);
		stat1.append(data5);
		stat1.append(data6);
		stat1.append(data7);
		stat1.append(data8);
		data1 = null;
		stat1.append(data1);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation() + "\n");
	}// main method

}// class
