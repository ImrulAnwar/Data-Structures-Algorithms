package com.company.data_structures.tree

class BinaryTree<DataType> (var value : DataType){
        inner class Node(var data: DataType, var left: Node? = null, var right: Node? = null)

        var topNode: Node = Node(value)
        fun addLeft(value: DataType) {
                topNode.left = Node(value)
        }
        fun addRight(value: DataType) {
                topNode.right = Node(value)
        }
}