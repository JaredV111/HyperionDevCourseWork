
# For each listed topic, you might find example code. Uncomment it and run
# the script to observe the output. Once done, comment it out so that it doesn't
# intefere with the other example codes.


# =========================== About SciKit learn ===============================
''' SciKit learn package provides simple and efficient tools for data mining and 
data analysis. It is open source, so you can get it for FREE at no charge. Just 
like your NumPy, Matplotlib and SciPy. You will be guided on how to install the 
SciKit learn package and then run a simple example to test if the installation 
was really successful. '''

# ============================= Prerequisites ==================================
''' NumPy, SciPy and a working C++ compiler must be installed. The “packages” 
folder received on the earlier task has the SciPy package. Since you 
already installed NumPy, you will now have to install SciPy and Scikit learn 
packages. '''

# ====================== Installing SciPy via Internet =========================
''' Task 1 came with the “packages” folder which has all the packages you 
will need for the remaining tasks of this course. Copy this folder to your 
“C:\Python27” or “C:\Python34” directory where your python files were installed.
For this task, you will be guided on how to install the SciPy package for 
Python 2. If you are using Python 3 you will need to select the SciPy package 
for Python 3. For clarity, the cp27 files are for Python2 and the cp34 files 
are for Python34 etc. If you want to download the latest versions of these 
packages, click on the links: NumPy, SciPy, Matplotlib and save them to the 
“packages” folder.If you want to download the latest versions of these packages,
visit the links:

NumPy: http://goo.gl/3KgtG8
SciPy: http://goo.gl/ha5LIS
Matplotlib: http://goo.gl/jRYfZ

- If you have already installed Microsoft Visual C++ Compiler for Python 2.7, 
proceed to Step 2 else double click on the Microsoft Visual C++ Compiler for 
Python 2.7 file to install it.

- Open “cmd” - command prompt by typing “cmd” on the windows search bar or press
the windows key + r then type “cmd” and press Enter key. 

- Once the command prompt has launched, type cd C:\Python27\Scripts and press 
Enter. 
The command for installing any package in python is pip install package_name. 
To install SciPy type “pip install scipy” and press Enter. '''

# ========================= Installing SciPy locally ===========================
'''
- If you have already installed Microsoft Visual C++ Compiler for Python 2.7, 
proceed to Step 2 else double click on the Microsoft Visual C++ Compiler for 
Python 2.7 file to install it.

- Open “cmd” - command prompt by typing “cmd” on the windows  search bar or 
press the windows key + r then type “cmd” and press Enter key. 

- Once the command prompt has launched, type cd C:\Python27\Scripts and press 
Enter.

- Install SciPy by typing 
pip install C:\Python27\packages\scipy-0.17.1-cp27-cp27m-win32.whl and press 
Enter. You should get the same screen output as one below. '''

# If you did not get any errors then you have successfully installed the NumPy 
# package and you are ready to learn using NumPy. If you have problems 
# completing the installation, contact your tutor to assist you.

# ====================== Installing SciKit Learn via Internet ==================
'''
- If you have already installed Microsoft Visual C++ Compiler for Python 2.7, 
proceed to Step 2 else double click on the Microsoft Visual C++ Compiler for 
Python 2.7 file to install it.

- The SciKit learn website has a webpage that covers installations across 
various operating systems. We will only cover installing SciKit for windows.

- Open “cmd” - command prompt by typing “cmd” on the windows search bar or press
the windows key + r then type “cmd” and press Enter key. 

- Once the command prompt has launched, type cd C:\Python27\Scripts and press 
Enter. 

- The command for installing any package in python is pip install package_name.
To install Matplotlib type “pip install sklearn” and press Enter. '''

# ======================== Installing SciKit Learn locally =====================
'''
- If you have already installed Microsoft Visual C++ Compiler for Python 2.7, 
proceed to the next step else double click on the Microsoft Visual C++ Compiler
for Python 2.7 file to install it.

- Open “cmd” - command prompt by typing “cmd” on the windows search bar or press
the windows key + r then type “cmd” and press Enter key. 

- Once the command prompt has launched, type cd C:\Python27\Scripts and press 
Enter. 

- Install SciKit learn by typing 
pip install C:\Python27\packages\scikit_learn-0.17.1-cp27-cp27m-win32.whl and 
press Enter. '''

# ==================== SciKit learn Example using the iris dataset =============
''' Let’s load the popular iris dataset in pattern recognition using scikit 
learn. Before we do that, here is a short description of the iris dataset. The 
iris dataset contains 3 classes of 50 instances each; a total of 150 
observations of the iris flower specifying some measurements: sepal length, 
sepal width, petal length and petal width. Each class refers to the type of iris
plant. The three classes are Setosa, Versicolour and Virginica. One class is 
linearly separable from the other 2; the latter are NOT linearly separable from 
each other. The goal is to predict the class of the iris plant. Hence, it is 
said to be supervised learning. '''

# ============================== Loading the dataset ===========================
''' There are two ways in which you can load a dataset from sklearn. If you are 
using a slow PC or laptop this might take a few seconds.

Option 1
The first is to use sklearn module to import all datasets and then use the 
dot (.) notation to specify which dataset to load. 

from sklearn import datasets
iris = datasets.load_iris()

Option 2
Another way is to use sklearn.datasets module to import load_iris. Using this 
approach will omit the use of the dot (.) notation and just invoke the 
load_iris() function directly.

from sklearn.datasets import load_iris
iris = load_iris()

The 2nd option is considered convenient since you load only the dataset you will
be working on rather than all sklearn datasets which you might not use. Sklearn 
uses the data type called “bunch”  which is a container storing datasets and 
their attributes. '''

# ========================= Iris dataset “bunch” attributes ====================
''' These are the attributes contained in the iris dataset, namely; 
target_names, data, target, DESCR, and feature_names. Let’s print out these 
attributes and the dataset object type.

Example code:
--------------------------------------------------------------------------------
from sklearn import datasets
iris = datasets.load_iris()
print(type(iris))
print(iris['target_names'])
print(iris['data'])
print(iris['target'])
print(iris['DESCR'])
print(iris['feature_names'])
print(iris) #iris is the dataset object
--------------------------------------------------------------------------------
'''

# ======================== Scatter plot of the iris dataset ====================
''' Let’s make a scatter plot of the iris dataset. The first thing to do is to 
import any packages we to be used i.e. matplotlib.pyplot, sklearn.datasets and 
numpy. In line 5 to 7, a figure and subplots are created. In line 9 to 11, an 
iris dataset is loaded to the “iris” object and then the iris object is used to 
extract the information in data and target attributes. In line 13, a dictionary 
is created to reference colors for the 3 classes. The reason why 0, 1 and 2 are 
used is because they represent the 3 classes, namely; Setosa, Versicolor and 
Virginica. Next an array of colors is created so that the 3 classes are plotted 
in different colors. Lastly, the scatter plots are plotted in their respective 
axes and shown. The first scatter plot uses column 0 and 1. The second scatter 
plot uses column 0 and 1. 

Example code:
--------------------------------------------------------------------------------
import matplotlib.pyplot as plt
from sklearn.datasets import load_iris
import numpy as np

fig = plt.figure()
ax1 = plt.subplot(2,1,1)
ax2 = plt.subplot(2,1,2)

iris = load_iris()
data = np.array(iris['data'])
targets = np.array(iris['target'])

cd = {0:'r',1:'b',2:"g"}
cols = np.array([cd[target] for target in targets])

ax1.scatter(data[:,0], data[:,1], c=cols)
ax2.scatter(data[:,0], data[:,2], c=cols)
plt.show()
--------------------------------------------------------------------------------
'''
# ============================= Compulsory Task 1 ==============================
'''
- Create a python file called “IrisDatasetPlot.py”.
- Write code to produce the same figure as "ML2_CT1.jpg" and save your figure.
- Hint: Note that there are 2 features being used for each subplot. i.e.The 
first 2 subplots came from our example of plotting the iris dataset. This is a 
permutation problem. From 4 features choose 2 which equals 12 choices in total. 
That is why there are 12 subplots in total. '''