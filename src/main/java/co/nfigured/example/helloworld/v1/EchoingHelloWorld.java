/**
 * Copyright (c) 2011 RedEngine Ltd, http://www.RedEngine.co.nz. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package co.nfigured.example.helloworld.v1;

import javax.inject.Inject;
import javax.inject.Provider;

import net.stickycode.stereotype.Configured;
import net.stickycode.stereotype.component.StickyService;

@StickyService
public class EchoingHelloWorld
  implements HelloWorld {
  
  @Configured
  String message;
  
  @Configured
  Integer startIndex;
  
  @Inject
  Provider<Stuff> bob;

  @Override
  public String hello(String name) {
    return message + " "+ name;
  }

  @Override
  public Integer count() {
    return startIndex++;
  }

}
