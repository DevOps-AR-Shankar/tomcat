/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2 {

    static final FunctionDescriptor FIPS_mode$FUNC = FunctionDescriptor.of(JAVA_INT);
    static final MethodHandle FIPS_mode$MH = RuntimeHelper.downcallHandle(
        "FIPS_mode",
        constants$2.FIPS_mode$FUNC, false
    );
    static final FunctionDescriptor FIPS_mode_set$FUNC = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle FIPS_mode_set$MH = RuntimeHelper.downcallHandle(
        "FIPS_mode_set",
        constants$2.FIPS_mode_set$FUNC, false
    );
    static final FunctionDescriptor BIO_ctrl_pending$FUNC = FunctionDescriptor.of(JAVA_LONG,
        ADDRESS
    );
    static final MethodHandle BIO_ctrl_pending$MH = RuntimeHelper.downcallHandle(
        "BIO_ctrl_pending",
        constants$2.BIO_ctrl_pending$FUNC, false
    );
    static final FunctionDescriptor BIO_s_file$FUNC = FunctionDescriptor.of(ADDRESS);
    static final MethodHandle BIO_s_file$MH = RuntimeHelper.downcallHandle(
        "BIO_s_file",
        constants$2.BIO_s_file$FUNC, false
    );
    static final FunctionDescriptor BIO_new_file$FUNC = FunctionDescriptor.of(ADDRESS,
        ADDRESS,
        ADDRESS
    );
    static final MethodHandle BIO_new_file$MH = RuntimeHelper.downcallHandle(
        "BIO_new_file",
        constants$2.BIO_new_file$FUNC, false
    );
    static final FunctionDescriptor BIO_new$FUNC = FunctionDescriptor.of(ADDRESS,
        ADDRESS
    );
    static final MethodHandle BIO_new$MH = RuntimeHelper.downcallHandle(
        "BIO_new",
        constants$2.BIO_new$FUNC, false
    );
}

