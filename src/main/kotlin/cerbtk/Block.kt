// (c) 2018 infinimesh, Inc
// www.infinimesh.io
//
// (c) 2018 Adrian Marszałek
//
// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package cerbtk

import org.apache.commons.codec.digest.DigestUtils
import java.util.*

class Block(val index: Int,
            val previousHash: String,
            val data: Any,
            val proofOfWork: Int) {

    val hash = calculateHash()
    val timestamp: Long = Date().time

    private fun calculateHash(): String {
        val input = (index.toString() + previousHash + timestamp + data).toByteArray()
        return DigestUtils.sha256Hex(input)
    }
}