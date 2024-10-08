/**
 * Copyright 2024 the original author or authors from the Jeddict project (https://jeddict.github.io/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package fish.payara.starter.application.util;

import java.util.Set;

/**
 *
 * @author Gaurav Gupta
 */
public class JPAUtil {

    public static final Set<String> SQL_RESERVED_KEYWORDS = Set.of(
            "ADD", "ALL", "ALTER", "AND", "ANY", "AS", "ASC", "BACKUP", "BETWEEN", "BY", "CASE", "CHECK",
            "COLUMN", "CONSTRAINT", "CREATE", "DATABASE", "DEFAULT", "DELETE", "DESC", "DISTINCT", "DROP",
            "EXEC", "EXISTS", "FOREIGN", "FROM", "FULL", "GROUP", "HAVING", "IN", "INDEX", "INNER", "INSERT",
            "INTO", "IS", "JOIN", "LEFT", "LIKE", "LIMIT", "NOT", "NULL", "ON", "OR", "ORDER", "OUTER",
            "PRIMARY", "PROCEDURE", "RIGHT", "ROWNUM", "SELECT", "SET", "TABLE", "TOP", "TRUNCATE", "UNION",
            "UNIQUE", "UPDATE", "VALUES", "VIEW", "WHERE"
    );
}
