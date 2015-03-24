#flatten.rb

def flatten(array)
	out=[]
	if array.empty? 
		return []
	else

		for value in array
			if value.kind_of?(Array)

				for newval in value
					out.push(newval)
				end
			
			else
				out.push(value)
			end
		end
		return out
	end
end

#puts flatten([[1,2,3],[],['a','p']])
#puts flatten([1,2,3])
puts flatten([])