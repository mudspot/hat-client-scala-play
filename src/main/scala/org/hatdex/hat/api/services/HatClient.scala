/*
 * Copyright (C) 2016 HAT Data Exchange Ltd - All Rights Reserved
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * Written by Andrius Aucinas <andrius.aucinas@hatdex.org>, 2 / 2017
 *
 */

package org.hatdex.hat.api.services

import javax.inject.Inject

import play.api.libs.ws.WSClient

class HatClient(val ws: WSClient, val hatAddress: String, override val schema: String) extends HatAuthentication
  with HatDataDebits
  with HatDataDebitsV2
  with HatDataTables
  with HatDataRecords
  with HatRichData
  with HatApplications
  with HatSystem {
  @Inject def this(ws: WSClient, hatAddress: String) = this(ws, hatAddress, "https://")

  val logger = play.api.Logger(this.getClass)
}
