/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Consulta module
 */
define(['ojs/ojcore', 'knockout'
], function (oj, ko) {
    /**
     * The view model for the main content view template
     */
    function ConsultaContentViewModel() {
        var self = this;
        self.firstName = ko.observable("Planet");
        self.lastName = ko.observable("Earth");
        self.fullName = ko.pureComputed(function () {
            return this.firstName() + " " + this.lastName();
        }, this);
    }
    
    return ConsultaContentViewModel;
});
