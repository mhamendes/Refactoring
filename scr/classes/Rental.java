package classes;

class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
    }
    public int getDaysRented() {
      return _daysRented;
    }
    public Movie getMovie() {
      return _movie;
    }
    double getCharge() { // veja que não precisa mais de parâmetro
       return _movie.getCharge(_daysRented);
     }

     private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
      }

      int getFrequentRenterPoints() {
          return _movie.getFrequentRenterPoints(_daysRented);
      }

      private int getTotalFrequentRenterPoints(){
          int result = 0;
          Enumeration rentals = _rentals.elements();
          while (rentals.hasMoreElements()) {
              Rental each = (Rental) rentals.nextElement();
              result += each.getFrequentRenterPoints();
          }
          return result;
      }
}
