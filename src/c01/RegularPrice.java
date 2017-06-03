package c01;

import edu.makoto.movie.Movie;

public class RegularPrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.REGULAR;
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 2;

		if (daysRented > 2)
			result += (daysRented - 2);

		return result;
	}
}
