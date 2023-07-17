-- File: 'Bridging the Gap.lua'

--[[
This script aims to bridge the gap between 2 distinct programs.
It uses the Lua programming language and its features to achieve this.
--]]

-- require the necessary modules for the program
local math = require('math')
local string = require('string')

-- define the global variables used
local x, y, z

-- declare the functions
local function calculateDistance(x, y, z) 
	-- calculate the distance between two points
	local dist = math.sqrt(x^2 + y^2 + z^2)
	return dist
end

local function calculateAverage(x, y, z)
	-- calculate the average of three numbers
	local average = (x + y + z) / 3
	return average
end

local function formatString(str) 
	-- format the string to be more readable
	local newStr = string.gsub(str, '-', ' ')
	return newStr
end

local function run()
	-- main program loop
	while true do
		local input = input('Enter three numbers: ')

		-- split the input string into an array
		local inputArray = {}
		for i in string.gmatch(input, "%S+") do
		   inputArray[#inputArray + 1] = i
		end

		-- check if the three numbers were entered
		if #inputArray ~= 3 then
			print('Please enter three numbers.')
			return
		end

		-- convert the input into numbers
		x = tonumber(inputArray[1])
		y = tonumber(inputArray[2])
		z = tonumber(inputArray[3])	

		-- compute the functions
		local distance = calculateDistance(x, y, z)
		local average = calculateAverage(x, y, z)
		local formattedStr = formatString(input)

		-- output the results
		print('The distance between the three points is ' .. distance .. '.')
		print('The average of the three numbers is ' .. average .. '.')
		print('The formatted string is: ' .. formattedStr .. '.')
	end
end

local function main()
	run()
end

main()