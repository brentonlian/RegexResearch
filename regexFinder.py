import re

#with open('C:\\Users\\Brenton\\rules3txt.txt','r') as f:
    #contents = f.read()
    #print(contents)

#pcre:"/^USER\s+w0rm/smi";

import re
#regex = """pcre.*"$;"""
pattern = re.compile("pcre([^;]*)")

#for i, line in enumerate(open('C:\Users\Brenton\Downloads\snortrules-snapshot-31350.tar\snortrules-snapshot-31350','r')):
for i, line in enumerate(open('C:\\Users\\Brenton\\Downloads\\snortrules-snapshot-31350.tar\\snortrules-snapshot-31350\\combinedrules.txt','r')):
    for match in re.finditer(pattern, line):
        print  ( match.group())
#pcre.*;
