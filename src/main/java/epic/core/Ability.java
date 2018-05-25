package epic.core;

public class Ability extends Epic {
    public Integer modifier(Integer score) {
        if (score % 2 == 0) {
            return (int) ((score - 10) / 2.0);
        } else {
            return (int) ((score - 1 - 10) / 2.0);
        }

    }
}
