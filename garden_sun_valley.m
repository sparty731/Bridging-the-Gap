% Program to bridge the gap between two points

% Set matrix variable A
A = [2 4 6 8 10;
     3 6 9 12 15;
     4 8 12 16 20;
     5 10 15 20 25];

% Initialize variables
i = 1;
j = 1;
m = size(A,1);

% Iterate through each element of matrix A
for k = 1:m^2
    % Print the current element
    fprintf('Element[%d, %d] = %d\n',i,j,A(i,j)) 
    % Check if current element is the last on the row
    if j == m
        % Reset column index to 1
        j = 1;
        % Increment row index
        i = i + 1;
    else 
        % Increment column index
        j = j + 1;
    end
end

% Create vector from matrix variable B
B = reshape(A,[1,m^2]);

% Initialize total and count variables
total = 0;
count = 0;

% Iterate through vector B
for l = 1:length(B)
    % Check if the element is odd
    if mod(B(l),2) ~= 0 
        % Add the element to total
        total = total + B(l);
        % Increment count
        count = count + 1;
    end
end

% Calculate and print the average
avg = total/count;
fprintf('Average of all odd elements = %.2f\n',avg)

% Create matrix variable C from vector B
C = reshape(B,m,m);

% Calculate and print the sum of all elements in matrix C
sumC = sum(sum(C));
fprintf('Sum of all elements of matrix C = %d\n',sumC)

% Calculate and print the maximum element of matrix C
maxC = max(max(C));
fprintf('Maximum element of matrix C = %d\n',maxC)

% Set row and column indices
i = 2;
j = 4;

% Calculate and print the sum of elements in a single row
rowSum = sum(C(i,:));
fprintf('Sum of all elements of row %d of matrix C = %d\n',i,rowSum)

% Calculate and print the sum of elements in a single column
colSum = sum(C(:,j));
fprintf('Sum of all elements of column %d of matrix C = %d\n',j,colSum)