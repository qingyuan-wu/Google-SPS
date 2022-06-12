// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
async function addRandomFact() {
    const response = await fetch('hello');
    const messages = await response.json();

  // Pick a random greeting.
  console.log(messages);
  console.log(messages.length)
  const greeting = messages[Math.floor(Math.random() * messages.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('fun-fact-container');
  greetingContainer.innerText = greeting;
}

async function getServerMessage() {
    const response = await fetch('/hello');
    const message = await response.text();

    const container = document.getElementById('server-container');
    container.innerHTML = message;
}
