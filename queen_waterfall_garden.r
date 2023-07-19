# Bridging the Gap

# 1. Load necessary packages

library(tidyverse)
library(dplyr)
library(purrr)

# 2. Load the raw data

data <- read_csv("gapminder.csv")

# 3. Explore the data

str(data)
head(data)

# 4. Subset the data to focus on year 2000

data_2000 <- data %>% 
  filter(year == 2000)

# 5. Calculate the average population for each continent

avg_pop <- data_2000 %>% 
  group_by(continent) %>% 
  summarise(avg_pop = mean(population))

# 6. Visualize the results

ggplot(avg_pop, aes(x = continent, y = avg_pop)) +
  geom_col() +
  labs(title = "Average Population by Continent in 2000", 
       x = "Continent", 
       y = "Average Population")

# 7. Calculate the average life expectancy for each continent

avg_life_exp <- data_2000 %>%
  group_by(continent) %>%
  summarise(avg_life_exp = mean(lifeExp))

# 8. Visualize the results

ggplot(avg_life_exp, aes(x = continent, y = avg_life_exp)) +
  geom_col() +
  labs(title = "Average Life Expectancy by Continent in 2000", 
       x = "Continent", 
       y = "Average Life Expectancy")

# 9. Merge the two datasets

merged_data <- merge(avg_pop, avg_life_exp)

# 10. Visualize the merged dataset

ggplot(merged_data, aes(x = continent, y = avg_pop)) +
  geom_col(aes(fill = avg_life_exp)) +
  labs(title = "Average Population vs Life Expectancy in 2000", 
       x = "Continent", 
       y = "Average Population",
       fill = "Average Life Expectancy")

# 11. Calculate the total population for each continent

sum_pop <- data_2000 %>% 
  group_by(continent) %>% 
  summarise(sum_pop = sum(population))

# 12. Visualize the results

ggplot(sum_pop, aes(x = continent, y = sum_pop)) +
  geom_col() +
  labs(title = "Total Population by Continent in 2000", 
       x = "Continent", 
       y = "Total Population")

# 13. Use the map_dbl() function to calculate the population-weighted average life expectancy

weighted_avg_life_exp <- map_dbl(unique(data_2000$continent),
                            ~data_2000 %>%
                              filter(continent == .) %>%
                              summarise(weighted_avg_life_exp = sum(population*lifeExp)/sum(population)) %>% 
                              pull(weighted_avg_life_exp))

# 14. Assign the weighted average life expectancy to the continent

weighted_avg_life_exp <- tibble(continent = unique(data_2000$continent), weighted_avg_life_exp)

# 15. Visualize the results

ggplot(weighted_avg_life_exp, aes(x = continent, y = weighted_avg_life_exp)) +
  geom_col() +
  labs(title = "Population-Weighted Average Life Expectancy by Continent in 2000", 
       x = "Continent", 
       y = "Population-Weighted Average Life Expectancy")

# 16. Calculate the total number of countries for each continent

cont_count <- data_2000 %>% 
  group_by(continent) %>% 
  summarise(cont_count = n())

# 17. Visualize the results

ggplot(cont_count, aes(x = continent, y = cont_count)) +
  geom_col() +
  labs(title = "Number of Countries by Continent in 2000", 
       x = "Continent", 
       y = "Number of Countries")

# 18. Merge the two datasets

merged_data2 <- merge(sum_pop, cont_count)

# 19. Visualize the merged dataset

ggplot(merged_data2, aes(x = continent, y = sum_pop)) +
  geom_col(aes(fill = cont_count)) +
  labs(title = "Total Population vs Number of Countries in 2000", 
       x = "Continent", 
       y = "Total Population",
       fill = "Number of Countries")

# 20. Calculate the average population density for each continent

avg_pop_density <- map_dbl(unique(data_2000$continent),
                            ~data_2000 %>%
                              filter(continent == .) %>%
                              summarise(avg_pop_density = sum(population)/sum(area)) %>% 
                              pull(avg_pop_density))

# 21. Assign the average population density to the continent

avg_pop_density <- tibble(continent = unique(data_2000$continent), avg_pop_density)

# 22. Visualize the results

ggplot(avg_pop_density, aes(x = continent, y = avg_pop_density)) +
  geom_col() +
  labs(title = "Average Population Density by Continent in 2000", 
       x = "Continent", 
       y = "Average Population Density")