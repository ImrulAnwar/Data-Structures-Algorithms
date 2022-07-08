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

        fun preOrderTraverse(root: Node= topNode) {
                println(root.data)
                root.left?.let{ preOrderTraverse(it) }
                root.right?.let { preOrderTraverse(it) }
        }
        fun postOrderTraverse(root: Node= topNode) {
                root.left?.let{ postOrderTraverse(it) }
                root.right?.let { postOrderTraverse(it) }
                println(root.data)
        }
        fun inOrderTraverse(root: Node = topNode){
                root.left?.let{ postOrderTraverse(it) }
                println(root.data)
                root.right?.let { postOrderTraverse(it) }
        }
}