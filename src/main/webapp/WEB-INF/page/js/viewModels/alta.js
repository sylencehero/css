/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Alta module
 */
define(['ojs/ojcore', 'knockout', 'jquery', 'ojs/ojknockout', 'ojs/ojtabs'],
function(oj, ko, $)
{   
  $(
    function()
    {
      ko.applyBindings(null, document.getElementById('vtabs-container'));
    });
});