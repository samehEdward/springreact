import React, { Component } from "react";

export default class AddContacts extends Component {
  render() {
    return (
      <div class="row">
        <form class="col s12">
          <div class="row">
            <div class="input-field col s6">
              <input
                placeholder="Placeholder"
                id="first_name"
                type="text"
                className="validate"
              />
              <label for="first_name">First Name</label>
            </div>
            <div class="input-field col s6">
              <input id="last_name" type="text" className="validate" />
              <label for="last_name">Last Name</label>
            </div>
          </div>

          <div class="row">
            <div class="input-field col s12">
              <input id="email" type="email" className="validate" />
              <label for="email">Email</label>
            </div>
          </div>
          <div class="row">
            <div class="col s12">
              This is an inline input field:
              <div class="input-field inline">
                <input id="email_inline" type="email" className="validate" />
                <label for="email_inline">Email</label>
                <span
                  class="helper-text"
                  data-error="wrong"
                  data-success="right"
                >
                  Helper text
                </span>
              </div>
            </div>
          </div>
        </form>
      </div>
    );
  }
}
