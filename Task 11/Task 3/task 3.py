time_swim = int(input("Enter the time it takes to finish the swimming section in seconds: "))
time_run = int(input("Enter the time it takes to finish the running section in seconds: "))
time_cycle = int(input("Enter the time it takes to finish the running section in seconds: "))
print("time in minutes for swimming: ", time_swim )

print("time in minutes for running: " , time_run )

print("time in minutes for cycling: " , time_cycle )

total_time = (time_swim + time_run + time_cycle)
if total_time < 6000:
    print("Within qualifying time and here is your provicial colours. ")
else:
    print("Sorry you didnt qualify in time.")
