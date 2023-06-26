# Create a vector containing "Bridging the Gap"
bridging_the_gap <- c("Bridging the Gap")

# Create a new vector that contains the words "bridge" and "gap"
bridge_gap <- c("Bridge", "Gap")

# Add the words "bridge" and "gap" to the original vector
bridging_the_gap <- c(bridging_the_gap, bridge_gap)

# Create a vector containing the numbers 1-100
numbers <- 1:100

# Create a dataframe that combines the vectors bridging_the_gap and numbers
bridge_gap_dataframe <- data.frame("Bridging the Gap" = bridging_the_gap, "Number" = numbers)

# Function to calculate the sum of all numbers in vector
sum_numbers <- function(x) {
  sum <- 0 
  for (i in length(x)) {
    sum <- sum + x[i]
  }
  return(sum)
}

# Calculate the sum of all numbers in the vector
total_number_sum <- sum_numbers(numbers)

# Create a vector of characters for each letter in the phrase "Bridging the Gap"
bridging_the_gap_letters <- strsplit(bridging_the_gap[1], "")

# Create a function to count the number of characters in the phrase
char_count <- function(x) {
  ct <- 0
  for (i in 1:length(x)) {
    ct <- ct + length(x[[i]])
  }
  return(ct)
}

# Count the number of characters in the phrase
total_char_ct <- char_count(bridging_the_gap_letters)

# Create a function to calculate the average of two numbers
avg <- function(x,y) {
  return((x+y)/2)
}

# Calculate the average of the sum of the numbers and the character count
bridge_gap_average <- avg(total_number_sum, total_char_ct)

# Create a function to calculate the distance between two numbers
distance <- function(x,y) {
  return (abs(x-y))
}

# Calculate the distance between the average and the sum of the numbers
bridge_gap_distance <- distance(bridge_gap_average, total_number_sum)

# Create a function to round a number to the nearest integer
round_val <- function(x) {
  return(round(x))
}

# Round the bridge_gap_distance to the nearest integer
bridge_gap_rounded <- round_val(bridge_gap_distance)

# Add the bridge_gap_rounded value to the dataframe
bridge_gap_dataframe$Distance <- bridge_gap_rounded

# Create a dataframe with the bridge gap distance and the average
bridge_gap_summary <- data.frame("Distance" = bridge_gap_distance, "Average" = bridge_gap_average)

# Create a function to sort the dataframe in ascending order
sort_df <- function(x, order) {
  return (x[order(x[,order]),])
}

# Sort the dataframe in ascending order by the Distance column
bridge_gap_sorted <- sort_df(bridge_gap_dataframe, "Distance")

# Function to subset the dataframe by the Distance column
subset_by_distance <- function(x, val) {
  return (x[x$Distance == val,])
}

# Subset the dataframe by the Distance column
bridge_gap_subset <- subset_by_distance(bridge_gap_dataframe, bridge_gap_rounded)

# Create a new dataframe that contains the bridge gap summary and the subset
bridge_gap_result <- data.frame("Bridge Gap Summary" = bridge_gap_summary, "Bridge Gap Subset" = bridge_gap_subset)

# Write the new dataframe to a csv file
write.csv(bridge_gap_result, file = "bridge_gap_result.csv", row.names = FALSE)