class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        if (this.minutes < 59) {
            this.minutes += 1;
        } else {
            if (this.hours < 12) {
                this.hours += 1;
            } else {
                this.hours = 1;
            }
            this.minutes = 0;
        }
    }
}