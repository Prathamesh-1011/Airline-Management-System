-- Sample Flights
INSERT INTO flight (flight_number, origin, destination, departure_time, arrival_time, status)
VALUES
('AI101', 'New York', 'London', '2025-04-01T10:00:00', '2025-04-01T18:00:00', 'ON_TIME'),
('BA202', 'Los Angeles', 'Tokyo', '2025-04-03T12:00:00', '2025-04-04T06:00:00', 'DELAYED');

-- Sample Tickets
INSERT INTO ticket (passenger_name, email, flight_id, seat_number, status)
VALUES
('John Doe', 'john.doe@example.com', 1, 'A12', 'ACTIVE'),
('Jane Smith', 'jane.smith@example.com', 2, 'B5', 'ACTIVE');
