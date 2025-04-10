#!/bin/bash

set -e

JAVA_FILE="root4/src/main/java/Alo.java"

./gradlew assemble  --configuration-cache
./gradlew assemble  --configuration-cache

# Create the file initially if it doesn't exist
if [ ! -f "$JAVA_FILE" ]; then
  mkdir -p "$(dirname "$JAVA_FILE")"
  cat > "$JAVA_FILE" <<EOF
import java.lang.*;
public class Alo {

    public String sayAlo() {
        return "Alo";
    }

}
EOF
  echo "✅ Created initial Alo.java"
fi

# Determine the starting index by checking existing sayAloN methods
CURRENT_INDEX=$(grep -oP 'sayAlo\K\d+' "$JAVA_FILE" | sort -n | tail -n 1)
CURRENT_INDEX=${CURRENT_INDEX:-0}

# Loop to add one method and build each time
for i in $(seq $((CURRENT_INDEX + 1)) $((CURRENT_INDEX + 20))); do
  # Remove the last closing brace


  echo "✅ Appended sayAlo$i to $JAVA_FILE"

  # Run Gradle build
  ./gradlew assemble -Dscan.tag."large.3.21.1-nocc"

  echo "✅ Gradle build complete for iteration $i"
done
