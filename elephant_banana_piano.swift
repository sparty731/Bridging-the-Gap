import UIKit

class BridgeTheGap {

    let ageGroup1: [String] = ["Preschooler", "Early Elementary", "Upper Elementary"]
    let ageGroup2: [String] = ["Middle School", "High School"]
    let ageGroup3: [String] = ["College", "Adult Learner"]
    
    func startGapAnalysis() -> Void {
        let ageGroups = [ageGroup1, ageGroup2, ageGroup3]
        for index in 0..<ageGroups.count {
            analyzeAgeGroups(ageGroups: ageGroups[index])
        }
    }
    
    func analyzeAgeGroups(ageGroups: [String]) -> Void {
        for ageGroup in ageGroups {
           analyzeAgeGroup(ageGroup: ageGroup) 
        }
    }
    
    func analyzeAgeGroup(ageGroup: String) -> Void {
        switch ageGroup {
        case "Preschooler":
            print("Age Group Selected: \(ageGroup)")
            analyzePreschooler()
        case "Early Elementary":
            print("Age Group Selected: \(ageGroup)")
            analyzeEarlyElementary()
        case "Upper Elementary":
            print("Age Group Selected: \(ageGroup)")
            analyzeUpperElementary()
        case "Middle School":
            print("Age Group Selected: \(ageGroup)")
            analyzeMiddleSchool()
        case "High School":
            print("Age Group Selected: \(ageGroup)")
            analyzeHighSchool()
        case "College":
            print("Age Group Selected: \(ageGroup)")
            analyzeCollege()
        case "Adult Learner":
            print("Age Group Selected: \(ageGroup)")
            analyzeAdultLearner()
        default:
            break
        }
    }
    
    func analyzePreschooler() -> Void {
        print("Analyzing Prechoolers...")
        // analyze preschooler specific data
    }
    
    func analyzeEarlyElementary() -> Void {
        print("Analyzing Early Elementary...")
        // analyze early elementary specific data
    }
    
    func analyzeUpperElementary() -> Void {
        print("Analyzing Upper Elementary...")
        // analyze upper elementary specific data
    }
    
    func analyzeMiddleSchool() -> Void {
        print("Analyzing Middle School...")
        // analyze middle school specific data
    }
    
    func analyzeHighSchool() -> Void {
        print("Analyzing High School...")
        // analyze high school specific data
    }
    
    func analyzeCollege() -> Void {
        print("Analyzing College...")
        // analyze college specific data
    }
    
    func analyzeAdultLearner() -> Void {
        print("Analyzing Adult Learner...")
        // analyze adult learner specific data
    }
    
    static func getBridgeTheGapInstance() -> BridgeTheGap {
        return BridgeTheGap()
    }
    
}