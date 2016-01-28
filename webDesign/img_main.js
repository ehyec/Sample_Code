$(function(){
    $('.fadein img:gt(0)').hide();
    setInterval(function(){
      $('.fadein :first-child').fadeOut()
         .next('img').fadeIn()
         .end().appendTo('.fadein');}, 
      4000);
});

  


    
$(document).ready(function() {

    beginNow = setInterval(forwardImage, 4000);

    $('#leftArrow').click(function() {
        clearInterval(beginNow);
        backwardsImage();
    });

    $('#rightArrow').click(function() {
        clearInterval(beginNow);
        forwardImage();
    });


    //This function will find the key for the current Image

    function currentImageKey() {
        i = jQuery.inArray($('#slideshow').attr('src'), images);
        return i;
    }


    //This function will move the slideshow backwards one
    function backwardsImage() {
        currentImageKey();
        if (i == 0) {
            //changeImage(images.length - 1);
        } else {
            changeImage(i - 1);
        }
        checkArrows(i-1);
    }


    //This function will move the slideshow forward one
    function forwardImage() {
        currentImageKey();
        if (i < images.length - 1) {
            changeImage(i + 1);
        } else {
            //changeImage(0);
        }
        checkArrows(i+1) ;
    }

    


    //this function checks the arrows                  
    function checkArrows(i) {
        if (i == 0) {
            $('#button_previous').css('display', 'none');
            $('#button_next').css('display', 'inline');
        } else if (i == images.length - 1) {
            $('#button_next').css('display', 'none');
            $('#button_previous').css('display', 'inline');
        } else {
            $('#button_next').css('display', 'inline');
            $('#button_previous').css('display', 'inline');
        }            
    }


    //This function will change to image to whatever the variable i passes to it


    function changeImage(i) {
        $('.ingredi > img').stop().animate({
            opacity: 0,
        }, 200, function() {
            $('.ingredi > img').attr('src', images[i]);
            $('.ingredi > img').load(function() {
                $('.ingredi').stop().animate({
                    opacity: 1,
                }, 200)
            })
        })
    }

});


  