#1 - Libraries

# Load needed libraries
library(tidyverse)
library(ggplot2)
library(ggrepel)

#2 - Analyze Data

# Read in data
gap_data <- read_csv("Bridging_the_Gap.csv")

# Create a summary of the data
gap_summary <- gap_data %>%
  group_by(country) %>%
  summarise(gap_percent = mean(gap_percent)) %>%
  arrange(gap_percent)

# Create a boxplot to visualize the data
ggplot(data=gap_data, aes(x=country, y=gap_percent)) +
  geom_boxplot() +
  labs(x="Country", y="Gap Percent") +
  ggtitle("Gap Percent by Country")

#3 - Visualize Results

# Create a scatterplot to visualize the data
ggplot(data=gap_summary, aes(x=country, y=gap_percent)) +
  geom_point(size=2) +
  geom_text_repel(
    data = gap_summary,
    aes(label = gap_percent),
    size=3
  ) +
  labs(x="Country", y="Gap Percent") +
  ggtitle("Gap Percent by Country")

#4 - Generate Insights

# Find the countries with the highest and lowest gap
max_gap <- gap_data %>%
  summarize(country = country[which.max(gap_percent)],
            max_gap_percent = max(gap_percent))

min_gap <- gap_data %>%
  summarize(country = country[which.min(gap_percent)],
            min_gap_percent = min(gap_percent))

# Print out the values
print(max_gap)
print(min_gap)