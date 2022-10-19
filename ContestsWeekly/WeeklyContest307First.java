class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int length = energy.length;
        int requiredEnergy = -1*initialEnergy,requiredExperience = 0,currentExperience = initialExperience;
        for (int i = 0; i < length; i++)
        {
            requiredEnergy += energy[i];
            if(currentExperience <= experience[i])
            {
                requiredExperience += (experience[i]-currentExperience+1);
                currentExperience += (experience[i]-currentExperience+1);
            }
            currentExperience += experience[i];
        }
        if (requiredEnergy >= 0)
        {
            requiredEnergy += 1; 
        }
        else
        {
            requiredEnergy = 0;
        }
        return requiredEnergy+requiredExperience;
    }
}
