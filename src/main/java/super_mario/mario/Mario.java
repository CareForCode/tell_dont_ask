package super_mario.mario;

public class Mario {
    private State state;
    private int lifeCount;

    public Mario(State state, int lifeCount) {
        this.state = state;
        this.lifeCount = lifeCount;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getLifeCount() {
        return lifeCount;
    }

    public void setLifeCount(int lifeCount) {
        this.lifeCount = lifeCount;
    }
}
