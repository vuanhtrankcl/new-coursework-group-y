# TODO
1. Refine the grammar
    - Add Unit type
    - Add INT to specify how many time units ahead to forecast asset
    - Define if statement to fit into a use case
    - Possibly remove for statement
    - Add cross references (refence variable by name)
2. Code generation
    - Figure out how to import packages into runtime project
    - Resolve generation issue (place files in a custom package not default one)
    - Cash class (hold current cash)
        * Withdraw - make sure you cannot withdraw more than you have
        * Deposit
    - Portfolio Class
        - Store array of bonds
        - Store array of options
        - Store 1 instance of cash
    - Static class to view
        - static method view bond (input parameter is bond)
        - static method view option (input parameter is option)
        - static method view portfolio (input is portfolio object)
        - static method view cash
    - Buy and sell
        - Make sure you cannot buy or sell more than you have
        - Should be able to buy / sell new bond (new definition within statement)
    - If statement
        - when use case define codegen needs to reflect this
3. Scoping
    - Make sure we cannot reference variable outside of scope or that is not currently defined
        * Already shown and done in the lectures about scoping
4. UI
    - If json is fully functional transition json output into tabular UI output
5. Documentation:
    - Annotate grammar perhaps
    - Document code generation
6. Testing
    - Test every rule for the grammar make sure no errors
    - Test scoping that it works

### View 
Try to create view into a json file (human readable)


## Track Items
[ ] Grammar
[ ] Code generation
[ ] Scoping
[ ] UI
[ ] Documentation
[ ] Testing

