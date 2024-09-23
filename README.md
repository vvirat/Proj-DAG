# Proj-DAG
# AIM:
This Java project demonstrates how to find the longest path between two vertices in a Directed Acyclic Graph (DAG). The approach is based on depth-first search (DFS) to explore the graph and identify the longest possible path.

# Overview:
The program sets up a DAG, adds vertices and edges, and finds the longest path between two specified vertices. By using depth-first search (DFS), it explores all possible paths to determine the longest one.

# Classes

# Main
The Main class contains the main method and serves as the entry point of the program which also acts as a driver for the program. Its role is to perform the following:

Initializing a graph - Here, the program creates a DAG with several vertices.
Adding vertices and edges - This part constructs the graph by defining connections between the nodes.
Printing the graph structure - This helps in visually verifying the graph before performing any algorithm.
Finding the longest path - Finally, it calculates the longest path between two specified vertices using DFS and outputs the result.

# Creating a graph
Adding vertices to the graph
Establishing edges to form the DAG
Displaying the graph structure
Finding and showing the longest path between two vertices

# Graph
The Graph class is mainly responsible for:

Adding vertices and edges - Helps with the methods to dynamically grow the graph.
Graph structure printing - A method to print out the adjacency list or matrix for clarity.
Finding the longest path - Implements the DFS logic to explore all possible paths and keep track of the longest travelled path.

**Comment**: The DFS approach is ideal for a DAG because there are no cycles, meaning each path will terminate naturally. This prevents infinite recursion and simplifies the implementation.

# Vertex
This class represents the nodes in the graph. It includes the following:

Vertex identifier: Each vertex has a unique label or identifier.
Adjacency list: Stores adjacent vertices to represent outgoing edges.

**Comment:** In a DAG, each vertex can have multiple outgoing edges but no cycles, ensuring paths have a clear start and end points.

# Steps that I followed to run the Program:
Ensured the Graph and Vertex classes are fully implemented.
I had to Run the Main class to initiate the program.

# Here’s what the program does step-by-step:

It creates a graph with 7 vertices (v1 to v7).
It adds edges to form a DAG structure.
It prints out the graph to visualize the connections.
Finally, it calculates and displays the longest path between vertices v1 and v6, along with the length of the path.
