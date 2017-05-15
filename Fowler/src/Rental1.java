class RentalChangeBlabla {
    private Movie movie;
    private int daysRented;
    public RentalChangeBlabla(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }
}
