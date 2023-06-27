<?php

// Define some constants to be used throughout the program
define('DEFAULT_GAP', 0.05);
define('MAX_GAP', 0.2);

// Main program
function bridge_the_gap($range, $gap) {
	
	// Check gap value and assign default if not provided
	if (empty($gap)) $gap = DEFAULT_GAP;

	// Validate gap is inside the valid range
	if ($gap > MAX_GAP) {
		throw new Exception('Gap value must be lower than '.MAX_GAP);
	}

	// Split range and remove white-spaced
	$range_values = explode(',', $range);
	$range_values = array_map('trim', $range_values);
	
	// Set initial values
	$start = $range_values[0];
	$end = $range_values[1];
	$interval_size = $gap;
	$intervals = array();
	
	// Calculate the intervals
	$interval_start = $start;
	$interval_end = $start + $interval_size;
	while ($interval_end < $end) {
		$intervals[] = array('start' => $interval_start, 'end' => $interval_end);
		$interval_start = $interval_end;
		$interval_end += $interval_size;
	}
	
	// Add last interval
	$intervals[] = array('start' => $interval_start, 'end' => $end);
	
	// Return the calculated intervals
	return $intervals;
}

// Sample function calls
$interval1 = bridge_the_gap('0, 10', 0.1);
$interval2 = bridge_the_gap('0, 10');

// Output the results 
echo 'Range 0-10 with gap 0.1:<br/>';
foreach ($interval1 as $interval) {
    echo $interval['start'].'-'.$interval['end'].'<br/>';
}

echo '<br/>Range 0-10 with default gap '.DEFAULT_GAP.':<br/>';
foreach ($interval2 as $interval) {
    echo $interval['start'].'-'.$interval['end'].'<br/>';
}

// Test the exception
try {
    bridge_the_gap('0, 10', 0.5);
} catch (Exception $e) {
    echo '<br/>Error: '.$e->getMessage();
}

?>