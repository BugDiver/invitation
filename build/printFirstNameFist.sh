rm -rf out/*
javac -cp "src" -d "out" src/com/invitation/LabelPrinter.java
java -cp "out" com.invitation.LabelPrinter -f $*