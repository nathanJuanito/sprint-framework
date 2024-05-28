set src_dir=C:/Work/Sprint0/framework/src
set temp_src=C:/Work/Sprint0/framework/temp-src
set bin_dir=C:/Work/Sprint0/framework/bin
set lib_dir=C:/Work/Sprint0/framework/lib
set work_dir=C:/Work/Sprint0/framework
set test_dir=C:/Work/Sprint0/test/lib

mkdir "%temp_src%"

for /R "%src_dir%" %%F in (*.java) do (n
    copy "%%F" "%temp_src%"
)
cd "%temp_src%"

javac -sourcepath "%temp_src%" -d "%bin_dir%" *.java

jar -cvf "%lib_dir%/test.jar" -C "%bin_dir%" .