package PierwszyTrener.Task4_List;


record Point2D(float x, float y) {
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}
