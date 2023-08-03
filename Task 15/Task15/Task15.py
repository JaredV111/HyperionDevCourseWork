import pygame #imports a game library that lets you use specific functions in your code.
import random #import to generate random numbers.
import os

pygame.init()

screen_width = 1280
screen_height = 680
screen = pygame.display.set_mode((screen_width, screen_height))#This creates a screen and gives it the width and height.

current_path = os.path.dirname('Task15')
resource_path = os.path.join(current_path,'Task 15')
image_path = os.path.join(resource_path,'Task 15')

player = pygame.image.load('player.jpg')
enemy_1 = pygame.image.load(os.path.join('enemy.png'))
enemy_2 = pygame.image.load(os.path.join('enemy.png'))
enemy_3 = pygame.image.load(os.path.join('enemy.png'))
prize = pygame.image.load(os.path.join('prize.jpg'))


image_height = player.get_height()
image_width = player.get_width()

enemy_1_height = enemy_1.get_height()
enemy_1_width = enemy_1.get_width()

enemy_2_height = enemy_2.get_height()
enemy_2_width = enemy_2.get_width()

enemy_3_height = enemy_3.get_height()
enemy_3_width = enemy_3.get_width()

prize_height = prize.get_height()
prize_width = prize.get_width()


#Player starting position
playerXPosition = 100
playerYPosition = 50

#Enemy Position
enemy_1XPosition = screen_width
enemy_1YPosition = random.randint(0, screen_height - enemy_1_height)

enemy_2XPosition = screen_width
enemy_2YPosition = random.randint(0, screen_height - enemy_2_height)

enemy_3XPosition = screen_width
enemy_3YPosition = random.randint(0, screen_height - enemy_3_height)

prizeXPosition = screen_width
prizeYPosition = random.randint(0, screen_height - prize_height)

#while loop
while 1:

    screen.fill(0)#clears the screen.
    screen.blit(player, (playerXPosition, playerYPosition))#draws the player to the screen at the position specified.
    screen.blit(enemy_1, (enemy_1XPosition, enemy_1YPosition))
    screen.blit(enemy_2, (enemy_2XPosition, enemy_2YPosition))
    screen.blit(enemy_3, (enemy_3XPosition, enemy_3YPosition))
    screen.blit(prize, (prizeXPosition, prizeYPosition))

    pygame.display.flip()#keeps the screen updated

    for event in pygame.event.get():

        if event.type == pygame.QUIT:
            pygame.quit()
            exit(0)

    #this event checks if the user press a key down

        if event.type == pygame.KEYDOWN:
            #test if the key released is the one we want.
            if event.key == pygame.K_UP:
                keyUp = True
            if event.key == pygame.K_DOWN:
                keyDown = True
            if event.key == pygame.K_LEFT:
                keyLeft = True
            if event.key == pygame.K_RIGHT:
                keyRight = True 


    #This checks in the event the key isnt being pressed.

        if event.type == pygame.KEYUP:

            if event.key == pygame.K_UP:
                keyUp = False
            if event.key == pygame.K_DOWN:
                keyDown = False
            if event.key == pygame.K_LEFT:
                keyLeft = False
            if event.key == pygame.K_RIGHT:
                keyRight = False

    #This makes sure the player doesn't move above the window.
    if keyUp == True:
        if playerYPosition >0 :
            playerYposition -= 1
    if keyDown == True:
            if playerYPosition < screen_height - image_height:
                playerYPosition += 1
        #Bounding box for the player:  

    playerBox = pygame.Rect(player.get_rect())
    #This follows the player and updates the playersBox position to the player's position
    playerBox.top = playerYPosition
    playerBox.left = playerXPosition

        #bounding the enemybox:
    enemy_1Box = pygame.Rect(enemy_1.get_rect())
    enemy_1Box.top = enemy_1YPosition
    enemy_1Box.left = enemy_1XPosition
        
    enemy_2Box = pygame.Rect(enemy_2.get_rect())
    enemy_2Box.top = enemy_2YPosition
    enemy_2Box.left = enemy_2XPosition

    enemy_3Box = pygame.Rect(enemy_3.get_rect())
    enemy_3Box.top = enemy_3YPosition
    enemy_3Box.left = enemy_3XPosition

    prizeBox = pygame.Rect(prize.get_rect())
    prizeBox.top = prizeYPosition
    prizeBox.left = prizeXPosition

    if playerBox.colliderect(enemyBox):
        print("You Lose!")

    if playerBox.colliderect(prizeBox):
        print("You Win!")
            
    if enemyXPosition < 0 - enemy_width:
        print("You Win!")
        

        pygame.quit()
        exit(0)

        #make enemy approach the player.
        enemy_1XPosition -= 0.15
        enemy_2XPosition -= 0.15
        enemy_3XPosition -= 0.15
        prizeXPosition -= 0.20
            
        #end    
        

