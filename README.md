<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

            Change: Changed title name 
            File: mainscreen.html 
            Line: 14
            
            Change: Changed <h1> tag
            File: mainscreen.html
            Line: 19

            Change: Changed name of parts
            File: mainscreen.html
            Line: 21
            
            Change: Changed name of products
            File: mainscreen.html
            Line: 53




D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
            
            Create: about.html
            Folder: templates
            
            Change: Added information about the company
            File: about.html
            Lines: 14-29
            
            Change: Created button back to mainscreen
            File: about.html
            Lines: 17-19

            Create: AboutController
            Folder: controllers

            Change: Created controller for about
            File: AboutController
            Lines: 6-12

            Change: Created button to about page 
            File: mainscreen.html
            Lines:17-19
E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
            
            Change: Added parts to inventory
            File: BootStrapData.java
            Lines: 42-94

            Change: Added products to inventory
            File: BootStrapData.java    
            Lines:98-109



F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
• The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.
        
            Change: Added Buy Now button
            File: mainscreen.html
            Line: 87

            Change: Added buy product controller
            File:AddProductController
            Lines: 177-189
    
            Create: Create failed.html
            Folder: templates

            Create: Create success.html
            Folder: templates

            Change: Added Logic to decrement product inventory by 1
            File: Product.java
            Lines: 103-108

            
            

G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

            Change: Added min and max inventory
            File: Part.java
            Lines: 31-34

            Change: Added getter and setters for min and max inventory
            File: Part.java
            Lines: 89-102

            Change: Added min and max values to parts table
            File: BootStrapData.java
            Lines: 48-49, 57-58, 66-67, 75-76, 84-85

            Change: Renamed the file presistent storage is saved to
            File: application.properties
            Line: 6

            Change:Added min and max values to InhousePartForm
            File: InhousePartForm.html
            Lines: 26-28
            
            Change: Added labels to form InhousePartForm fields
            File: InhousePartForm
            Lines: 18, 21, 24, 26, 29

            Change: Added min and max values to OutsourcedPartForm
            File:OutsourcedPartForm.html
            Lines: 27-31

            Change Added labels to form OutsourcedPartForm
            File: OutsourcedPartForm.html
            Lines: 17, 19, 22, 25

            Create: Created file InventoryValidator
            Folder: validators

            Change: Wrote if statement to validate inventory min and max
            File: InventoryValiator
            Lines: 31-37
            
            Create: Created file ValidInventory
            Folder: validators

            Change: Created an interface
            File: ValidInventory
            Lines: 16-22

            


H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

            Change: added error message display to InhousePartForm
            File: InhousePartFrom.html
            Lines: 32 - 39

            Change: added error message display to OutsourcePartForm
            File: OutsourcePartFrom.html
            Lines: 33 - 35

            Change: added validation message for max part inventory 
            File: InventoryValidator
            Line: 32

            Change: added validation message for min part inventory
            File: InventoryValidator
            Line: 35

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
           
            Change: added unit tests for max and min fields
            File: PartTest.java
            Lines: 160-176
    
J.  Remove the class files for any unused validators in order to clean your code.
            
            Change: Deleted Unused Validator
            File: DeletePartValidator.java
            Lines: all