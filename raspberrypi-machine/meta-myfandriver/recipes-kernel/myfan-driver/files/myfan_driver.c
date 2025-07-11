#include <linux/module.h> 
#include <linux/kernel.h> 
#include <linux/init.h> 

static int __init fandriver_init(void) { 
    printk(KERN_INFO "Init myfan!\n");
    return 0; 
} 

static void __exit fandriver_exit(void) { 
    printk(KERN_INFO "Exit myfan!\n"); 
} 

module_init(fandriver_init); 
module_exit(fandriver_exit); 

MODULE_LICENSE("GPL"); 