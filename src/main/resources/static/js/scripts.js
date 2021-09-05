
jQuery(document).ready(function() {

    /*
        Background slideshow
    */
    $.backstretch([
      "image/partybg2.jpg",
    ], {duration: 3000, fade: 750});

    /*
        Tooltips
    */
    // $('.links a.home').tooltip();
    // $('.links a.blog').tooltip();

    /*
        Form validation
    */
    $('.register div').submit(function(){
        $(this).find("label[for='firstname']").html('账号');
        ////
        var firstname = $(this).find('input#firstname').val();
        if(firstname == '') {
            $(this).find("label[for='firstname']").append("<span style='display:none' class='red'> - 请输入您的账号.</span>");
            $(this).find("label[for='firstname'] span").fadeIn('medium');
            return false;
        }
    });


});


