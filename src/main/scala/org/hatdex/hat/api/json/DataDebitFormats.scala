/*
 * Copyright (C) 2016 HAT Data Exchange Ltd - All Rights Reserved
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * Written by Andrius Aucinas <andrius.aucinas@hatdex.org>, 2 / 2017
 *
 */

package org.hatdex.hat.api.json

import org.hatdex.hat.api.models._
import play.api.libs.json.{ Format, Json }

trait DataDebitFormats extends HatJsonFormats with LocalDateTimeMarshalling {
  // Contextless bundle formats
  implicit val apiBundleContextlessDatasetDataFormat: Format[ApiBundleContextlessDatasetData] = Json.format[ApiBundleContextlessDatasetData]
  implicit val apiBundleContextlessDataFormat: Format[ApiBundleContextlessData] = Json.format[ApiBundleContextlessData]

  // Contextual bundle, entity property formats
  implicit val apiEventRelationshipFormat: Format[ApiEventRelationship] = Json.format[ApiEventRelationship]
  implicit val ApiLocationRelationshipFormat: Format[ApiLocationRelationship] = Json.format[ApiLocationRelationship]
  implicit val ApiPersonRelationshipFormat: Format[ApiPersonRelationship] = Json.format[ApiPersonRelationship]
  implicit val ApiThingRelationshipFormat: Format[ApiThingRelationship] = Json.format[ApiThingRelationship]
  implicit val ApiOrganisationRelationshipFormat: Format[ApiOrganisationRelationship] = Json.format[ApiOrganisationRelationship]

  implicit val apiSystemUnitofmeasurementFormat: Format[ApiSystemUnitofmeasurement] = Json.format[ApiSystemUnitofmeasurement]
  implicit val apiSystemTypeFormat: Format[ApiSystemType] = Json.format[ApiSystemType]
  implicit val apiPropertyFormat: Format[ApiProperty] = Json.format[ApiProperty]
  implicit val apiPropertyRelationshipStaticFormat: Format[ApiPropertyRelationshipStatic] = Json.format[ApiPropertyRelationshipStatic]
  implicit val apiPropertyRelationshipDynamicFormat: Format[ApiPropertyRelationshipDynamic] = Json.format[ApiPropertyRelationshipDynamic]

  // Contextual bundle, entity formats
  implicit val apiEventFormat: Format[ApiEvent] = Json.format[ApiEvent]
  implicit val apiPersonFormat: Format[ApiPerson] = Json.format[ApiPerson]
  implicit val apiThingFormat: Format[ApiThing] = Json.format[ApiThing]
  implicit val apiLocationFormat: Format[ApiLocation] = Json.format[ApiLocation]
  implicit val apiOrganisationFormat: Format[ApiOrganisation] = Json.format[ApiOrganisation]
  implicit val apiEntityFormat: Format[ApiEntity] = Json.format[ApiEntity]

  implicit val apiDataDebitFormat: Format[ApiDataDebit] = Json.format[ApiDataDebit]
  implicit val apiDataDebitOutFormat: Format[ApiDataDebitOut] = Json.format[ApiDataDebitOut]

}

object DataDebitFormats extends DataDebitFormats
