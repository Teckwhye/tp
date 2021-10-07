package seedu.duke.training;

import java.util.*;

public class TrainingList {

    private final ArrayList<TrainingSchedule>  trainingList;

    public TrainingList() {
        trainingList = new ArrayList<TrainingSchedule>();
    }

    public TrainingList(ArrayList<TrainingSchedule> inputTrainingList) {
        this.trainingList = inputTrainingList;
    }

    public ArrayList<TrainingSchedule> getTrainingList() {
        return trainingList;
    }

    public void addTrainingSchedule(TrainingSchedule schedule) {
        trainingList.add(schedule);
    }

    /**
     * Deletes training schedule based on index input by user. Index must be valid.
     *
     * @param trainingNum Index of the TrainingSchedule user wishes to delete
     * @return TrainingSchedule to be deleted
     * @throws IndexOutOfBoundsException Thrown when an invalid index is input to be deleted
     */
    public TrainingSchedule deleteTrainingSchedule(int trainingNum) throws IndexOutOfBoundsException {
        try {
            int indexToDelete = trainingNum - 1;
            TrainingSchedule training = trainingList.get(indexToDelete);
            trainingList.remove(indexToDelete);
            return training;
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
