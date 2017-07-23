<html>
    <head>
        <meta charset="utf-8">
        <title>jQuery Validation Plugin Examples</title>

        <!-- Bootstrap CSS used for styling the demo pages-->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <!-- Custom error messages and placement -->
        <form class="form" id="example2">
            <div class="form-group">
                <label>Custom messages and placement</label>
            </div>
            <div class="form-group" id="errors">
            </div>
            <div class="form-group">
                <label for="example2-fullname">Full name</label>
                <input type="text" class="form-control" id="example2-fullname" name="example2-fullname" placeholder="Enter your full name">
            </div>
            <div class="form-group">
                <label for="example2-phone">Phone number</label>
                <input type="text" class="form-control" id="example2-phone" name="example2-phone" placeholder="Enter your phone number">
            </div>
            <div class="form-group">
                <label for="example2-zip">Zip code</label>
                <input type="text" class="form-control" id="example2-zip" name="example2-zip" placeholder="Enter your zip code">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>

        <!-- Load jQuery and jQuery-Validate scripts -->
        <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
        <script src="js/jquery-validate.js"></script>
        <script>
            // When the document is ready
            $(document).ready(function () {

                //validation rules
                $("#example2").validate({
                    //set this to false if you don't what to set focus on the first invalid input
                    focusInvalid: false,
                    //by default validation will run on input keyup and focusout
                    //set this to false to validate on submit only
                    onkeyup: false,
                    onfocusout: false,
                    //by default the error elements is a <label>
                    errorElement: "div",
                    //place all errors in a <div id="errors"> element
                    errorPlacement: function(error, element) {
                        error.appendTo("div#errors");
                    },
                    rules: {
                        "example2-fullname": {
                            required: true,
                            minlength: 5
                        },
                        "example2-phone": {
                            required: true,
                            number: true
                        },
                        "example2-zip": {
                            required: true,
                            number: true,
                            rangelength : [3, 5]
                        }
                    },
                    messages: {
                        "example2-fullname": {
                            required: "You must enter your full name",
                            minlength: "First name must be at least 5 characters long"
                        },
                        "example2-phone": {
                            required: "You must enter your phone number",
                            number : "Phone number must contain digits only"
                        },
                        "example2-zip": {
                            required: "You must enter your zip code",
                            number: "Zip code must contain digits only",
                            rangelength : "Zip code must have between 3 to 5 digits"
                        }
                    }
                });

            });
        </script>
    </body>
</html>
